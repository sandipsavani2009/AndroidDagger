package com.sample.androiddagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mVehicleNameTextView;
    private TextView mRouteNameTextView;
    private EditText mVehicleNameEditText;
    private EditText mRouteNameEditText;

    /**
     * Component works as inter-mediator to get dependencies
     */
    private IPlannerComponent mIPlannerComponent;

    /**
     * Inject Vehicle object
     */
    @Inject
    Vehicle mVehicle;

    /**
     * Inject RouteProvider object
     */
    @Inject
    RouteProvider mRouteProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDagger();
        initViews();
    }

    private void initDagger() {
        String defaultVehicleName = "Default Vehicle";
        String defaultRouteName = "Default Route";

        /*
        Dagger<Component_name> is dagger framework style to create builder.
        An automatically created builder instance by Dagger will inject other class dependencies.
         */
        mIPlannerComponent = DaggerIPlannerComponent.builder()
                .picnicPlannerModule(new PicnicPlannerModule(defaultVehicleName, defaultRouteName))
                .build();

        mVehicle = mIPlannerComponent.providerVehicle();
        mRouteProvider = mIPlannerComponent.provideRoute();
    }

    private void initViews() {
        mVehicleNameTextView = (TextView) findViewById(R.id.vehicleNameTextView);
        mRouteNameTextView = (TextView) findViewById(R.id.routeNameTextView);
        mVehicleNameEditText = (EditText) findViewById(R.id.vehicleNameEditText);
        mRouteNameEditText = (EditText) findViewById(R.id.routeNameEditText);

        findViewById(R.id.showNamesButton).setOnClickListener(this);
        findViewById(R.id.changeNamesButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.showNamesButton:
                onShowDetailsButtonClicked();
                break;

            case R.id.changeNamesButton:
                onChangeDetailsButtonClicked();
                break;
        }
    }

    private void onShowDetailsButtonClicked() {
        mVehicleNameTextView.setText(mVehicle.getName());
        mRouteNameTextView.setText(mRouteProvider.getRouteName());
    }

    private void onChangeDetailsButtonClicked() {
        mVehicle.setName(mVehicleNameEditText.getText().toString());
        mRouteProvider.setRouteName(mRouteNameEditText.getText().toString());
    }
}
