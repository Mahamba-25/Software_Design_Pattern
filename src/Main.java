public class Main {
    public static void main(String[] args) {
        // Chain
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        // Установка цепочки
        paymentA.setNext(paymentB);
        paymentB.setNext(paymentC);

        // Покупка на сумму 210 долларов
        paymentA.handlePayment(210);


        // Command
        Television tv = new Television();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command volumeUp = new VolumeUpCommand(tv);
        Command volumeDown = new VolumeDownCommand(tv);
        Command nextChannel = new NextChannelCommand(tv);
        Command previousChannel = new PreviousChannelCommand(tv);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, turnOn);
        remote.setCommand(1, turnOff);
        remote.setCommand(2, volumeUp);
        remote.setCommand(3, volumeDown);
        remote.setCommand(4, nextChannel);
        remote.setCommand(5, previousChannel);

        remote.pressButton(0);  // Включение
        remote.pressButton(2);  // Увеличение громкости
        remote.pressButton(4);  // Следующий канал
        remote.pressButton(1);  // Выключение


        // Iterator
        ListMovieCollection listMovieCollection = new ListMovieCollection();
        listMovieCollection.addMovie("Inception");
        listMovieCollection.addMovie("Interstellar");

        // Коллекция фильмов на основе массива
        ArrayMovieCollection arrayMovieCollection = new ArrayMovieCollection(2);
        arrayMovieCollection.addMovie("Avatar");
        arrayMovieCollection.addMovie("Titanic");

        // Итерация по коллекции списка
        Iterator<String> listIterator = listMovieCollection.createIterator();
        System.out.println("Фильмы из списка:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Итерация по коллекции массива
        Iterator<String> arrayIterator = arrayMovieCollection.createIterator();
        System.out.println("\nФильмы из массива:");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }


        // Mediator
        HomeMediator mediator = new HomeMediatorImpl();

        Sensor tempSensor = new TemperatureSensor(mediator);
        Sensor humiditySensor = new HumiditySensor(mediator);
        Sensor lightSensor = new LightSensor(mediator);

        // Сенсоры передают данные
        tempSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        // Вывод отчета
        ((HomeMediatorImpl) mediator).printReport();


        // Memento
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Добавление текста и сохранение
        editor.addText("Первая строка текста.\n");
        caretaker.save(editor);
        System.out.println("Текущий текст:\n" + editor.getText());

        // Добавление еще текста и сохранение
        editor.addText("Вторая строка текста.\n");
        caretaker.save(editor);
        System.out.println("Текущий текст:\n" + editor.getText());

        // Восстановление предыдущего состояния
        caretaker.undo(editor);
        System.out.println("После отмены:\n" + editor.getText());

        // Восстановление еще одного состояния
        caretaker.undo(editor);
        System.out.println("После второй отмены:\n" + editor.getText());
    }
}