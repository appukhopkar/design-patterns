import com.design.patterns.abstractFactory.CollegeFactory;
import com.design.patterns.abstractFactory.CommerceCollegeFactory;
import com.design.patterns.abstractFactory.ScienceCollegeFactory;
import com.design.patterns.abstractFactory.Student;
import com.design.patterns.abstractFactory.Teacher;
import com.design.patterns.adapter.Database;
import com.design.patterns.adapter.DatabaseUpgraderV1toV2;
import com.design.patterns.adapter.DatabaseV2;
import com.design.patterns.bridge.Assemble;
import com.design.patterns.bridge.Bike;
import com.design.patterns.bridge.Car;
import com.design.patterns.bridge.Produce;
import com.design.patterns.bridge.Vehicle;
import com.design.patterns.builder.Computer;
import com.design.patterns.builder.ComputerBuilder;
import com.design.patterns.builder.ComputerDirector;
import com.design.patterns.builder.ConcreteComputerBuilder;
import com.design.patterns.chain.of.responsibility.Chain;
import com.design.patterns.chain.of.responsibility.ConcreteHandler1;
import com.design.patterns.chain.of.responsibility.ConcreteHandler2;
import com.design.patterns.chain.of.responsibility.ConcreteHandler3;
import com.design.patterns.chain.of.responsibility.ConcreteRequest;
import com.design.patterns.composite.Job;
import com.design.patterns.composite.JobList;
import com.design.patterns.composite.SimpleJob;
import com.design.patterns.decorator.CheeseBurstDecorator;
import com.design.patterns.decorator.MushroomDecorator;
import com.design.patterns.decorator.Pizza;
import com.design.patterns.decorator.PlainPizza;
import com.design.patterns.facade.ItalianMenu;
import com.design.patterns.facade.JapaneseMenu;
import com.design.patterns.facade.RestaurantKeeper;
import com.design.patterns.facade.RestaurantKeeperImpl;
import com.design.patterns.factory.abstractClass.ConcreteCreatorA;
import com.design.patterns.factory.abstractClass.ConcreteCreatorB;
import com.design.patterns.factory.abstractClass.Creator;
import com.design.patterns.factory.abstractClass.Schedule;
import com.design.patterns.observer.pull.based.Subject;
import com.design.patterns.observer.push.based.DatabaseSample;
import com.design.patterns.observer.push.based.DiskDispatcher;
import com.design.patterns.observer.push.based.EmailDispatcher;
import com.design.patterns.observer.push.based.Observer;
import com.design.patterns.observer.push.based.SlackDispatcher;
import com.design.patterns.prototype.Rectangle;
import com.design.patterns.prototype.Shape;
import com.design.patterns.prototype.ShapeClient;
import com.design.patterns.proxy.Image;
import com.design.patterns.proxy.ProxyImage;
import com.design.patterns.singleton.Singleton;
import com.design.patterns.strategy.BubbleSort;
import com.design.patterns.strategy.QuickSort;
import com.design.patterns.strategy.SortingStrategyContext;

public class Main {
    public static void mainSingleton(String[] args) {
        Singleton s = Singleton.getInstance();
        s.printMe("I am a singleton");
        s.printMe("I am another singleton");
    }
    public static void mainFactoryUsingAbstractClass(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Schedule teacherSchedule =  creatorA.factoryMethod();
        teacherSchedule.displaySchedule();

        Creator creatorB = new ConcreteCreatorB();
        Schedule studentSchedule = creatorB.factoryMethod();
        studentSchedule.displaySchedule();
    }

    public static void mainAbstractFactory(String[] args) {
        //Science stream
        CollegeFactory scienceCollege = new ScienceCollegeFactory();
        Teacher scienceTeacher = scienceCollege.createTeacher();
        Student scienceStudent = scienceCollege.createStudent();

        scienceTeacher.displayTeacherDetails();
        scienceStudent.displayStudentDetails();

        //Commerce stream
        CollegeFactory commerceCollege = new CommerceCollegeFactory();
        Teacher commerceTeacher = commerceCollege.createTeacher();
        Student commerceStudent = commerceCollege.createStudent();

        commerceTeacher.displayTeacherDetails();
        commerceStudent.displayStudentDetails();
    }

    public static void mainPrototype(String args[]) {
        // Create a prototype first, a yellow rectangle
        Shape shapePrototype = new Rectangle("Yellow");
        // Create client using the prototype
        ShapeClient client = new ShapeClient(shapePrototype);
        //Use above prototype to create a new shape
        Shape redRectangle = client.createShape();
        //Show color of newly created shape
        redRectangle.showColor();
    }

    public static void mainBuilder(String args[]) {

        ComputerBuilder builder = new ConcreteComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        Computer pc = director.constructComputer();

        System.out.println("HDD size : " + pc.getHDD() +
                " RAM size : " + pc.getRAM() +
                " No. of CPU cores : " + pc.getNumberOfCPUs() +
                " Bluetooth Enabled : " + pc.isBluetoothEnabled() +
                " Graphics card present : " + pc.isGraphicsEnabled());
    }

    public static void mainAdapter(String args[]) {
        DatabaseV2 newDB = new DatabaseV2(new DatabaseUpgraderV1toV2());
        newDB.onUpgrade();
    }

    public static void mainBridge(String[] args) {
        Vehicle car = new Car(new Produce(), new Assemble());
        car.manufacture();
        Vehicle bike = new Bike(new Produce(), new Assemble());
        bike.manufacture();
    }

    public static void mainComposite(String args[]) {
        Job simpleJob1 = new SimpleJob("Analysis");
        Job simpleJob2 = new SimpleJob("Feasibility checks");

        JobList projectTasks = new JobList("Project tasks");
        projectTasks.addJob(simpleJob1);
        projectTasks.addJob(simpleJob2);

        JobList implemtationTasks = new JobList("Development tasks");
        implemtationTasks.addJob(new SimpleJob("Code changes"));
        implemtationTasks.addJob(new SimpleJob("Code review and approval"));

        projectTasks.addJob(implemtationTasks);

        projectTasks.addJob(new SimpleJob("QA testing"));

        projectTasks.display();
    }

    public static void mainFacade(String args[]) {
        RestaurantKeeper keeper = new RestaurantKeeperImpl();
        ItalianMenu menu1 = keeper.getItalianMenu();
        JapaneseMenu menu2 = keeper.getJapaneseMenu();

        menu1.printMenu();
        menu2.printMenu();
    }

    public static void mainDecorator(String args[]) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + "," + pizza.cost());

        pizza = new CheeseBurstDecorator(pizza);
        System.out.println(pizza.getDescription() + "," + pizza.cost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + "," + pizza.cost());
    }

    public static void mainProxy(String args[]) {
        Image image = new ProxyImage("test.jpeg");
        // Image will be loaded from disk only when display() is called
        image.display();
        // Image will not be loaded again, as it has been cached in the Proxy
        image.display();
    }

    public static void mainObserverPushBased(String args[]) {
        DatabaseSample db = new DatabaseSample();

        Observer diskDispatcher = new DiskDispatcher();
        Observer emailDispatcher = new EmailDispatcher();
        Observer slackDispatcher = new SlackDispatcher();

        db.attach(diskDispatcher);
        db.attach(emailDispatcher);
        db.attach(slackDispatcher);
        db.setData("Hello");

        db.detach(slackDispatcher);
        db.setData("Good Morning");
    }

    public static void mainObserverPullBased(String args[]) {
        com.design.patterns.observer.pull.based.DatabaseSample db =
                new com.design.patterns.observer.pull.based.DatabaseSample();

        com.design.patterns.observer.pull.based.Observer diskDispatcher =
                new com.design.patterns.observer.pull.based.DiskDispatcher(db);
        com.design.patterns.observer.pull.based.Observer emailDispatcher =
                new com.design.patterns.observer.pull.based.EmailDispatcher(db);
        com.design.patterns.observer.pull.based.Observer slackDispatcher =
                new com.design.patterns.observer.pull.based.SlackDispatcher(db);

        db.attach(diskDispatcher);
        db.attach(emailDispatcher);
        db.attach(slackDispatcher);
        db.setData("Hello");

        db.detach(slackDispatcher);
        db.setData("Good Morning");
    }

    public static void mainChainOfResponsibility(String args[]){
        Chain chain = new Chain(new ConcreteHandler1(),
                new ConcreteHandler2(), new ConcreteHandler3());
        chain.process(new ConcreteRequest("First request"));
        chain.process(new ConcreteRequest(""));
    }

    public static void mainStrategy(String args[]) {
        int[] array = new int[] {10, 35, 89};
        SortingStrategyContext ctx = new SortingStrategyContext(new QuickSort());
        ctx.sort(array);
        ctx.setStrategy(new BubbleSort());
        ctx.sort(array);
    }
}