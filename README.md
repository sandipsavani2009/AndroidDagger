# What does Dagger do?

### Dagger is maintained by Google and a platform for Dependency Injection for program development designs.
### Dagger supports Java programing.

Dependency Injection is a program design principle in which code creating a NEW-OBJECT also provides the other objects that the NEW-OBJECT is dependent on for its operations.

Here, NEW-OBJECT can not complete its operations without objects those it requires for its operations are not available.

Lets understand it by example.

## EXMAPLE 1:

Coffee making machine has dependancy on heater, water and coffee-ingradients.
Without these dependents available to coffee maker machine, its not possible for it to complete its operation of making coffee.

So, when you say coffee machine to provide a coffee, machine resoves its dependencies on all other requirements for coffee making where as you need not to worry for all those needfull things.

Here NEW-OBJECT is coffee making machine.

## EXAMPLE-2:

You want to plan a picnic with help of program.
Your NEW-OBJECT is 'Plan_Picnic' which is a program instance/object.

Now dependencies on this object-instance called 'Plan_Picnic' are as:
1. Picnic schedule (Date - time dependacy)
2. Picnic place / route / map (Place & route dependacy)
3. Vehicle dependancy
There could be many more...

Until all the mentioned dependancies are not supplied to 'Plan_Picnic' object, it can not itself provide you your picnic plan.

To Complete on operation, you need to address other tasks which are necessary for your operation.
Here, dagger design halps you by just proceeding with your operation as dagger will tak care of its dependent tasks. 

Dependency is a Service-Object while Injection is providing Service-object to its dependent.
Here, in Example-2; Picnic schedule, map route, vehicles are service objects. Whereas providing these things to Plan_Picnic is Injection.

Dagger does dependancy injection for your android / java programs.

Please NOTE that dagger is DI framework.

# Why do DI (Dependancy Inject) require?

One of the best solution of common problem that you need a common handler / manager to be accessible into your app or for multiple apps.
For example, 

1. Choose a file to share into Apps. (A common way for all apps)
2. Providing Time & Date information into Apps. (A common way for all apps)
3. Micanism of sharing data, messages, contacts etc for many consumer apps.

Here, the need of DI is easily identifiable. Some of its usages are like:

1. Reusability
Similar type of operation common to all need not to be performed by all apps/programs. 
Enhancement & maintenance of service/dependancies is easy and simple to manage.

2. Simple to Manage 
DI solves many complexity of dependent objects. It helps to manage easily a wider program structure.
Take as a service provider is saperate than consumers into your program, its easy for all to change, enhance, use and modufy operations.

3. Loose coupling between classes and its systems. (Objects can be added/changed independently)
4. Potential of flexibility for future changes.
5. Clear architect design of tasks and operations of classes and program components.

# How Dagger is implemeted?

As we discussed earlier,dagger is framework for DI.
As its a framework which supports java/android for DI, there are some APIs tobe used to implement such program design pattern.

Dagger is normally implemented as java annotations which make it much easier to learn and use it.

Dagger 2 is newly provided Google framework, which supports following annotaions to use for pragrams.
1. @Module - for the classes whose methods provide dependencies
2. @Provides - for the methods within @Module classes
3. @Inject - to request a dependency (a constructor, a field, or a method)
4. @Component - is a bridge interface between modules and injection


### As Android development is mostly in Java, such Dependency Injection platform Dagger can be very userful.
### AndroidDagger is a simple code example to demostrate the same.
