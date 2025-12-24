class ProducerConsumerClient{

    public static void main(String[] args){
        System.out.println("Producer-Consumer Implementation in Java");
        int queueSize = 5;
        DataQueue dataQueue = new DataQueue(queueSize);

        String message = "Booking is complete for user: ";
        String[] users = new String[]{"user1", "user2", "user3", "user4", "user5", "user6", "user7"};

        for(String user : users){
            MessageCreator.addMessage(message + user);
        }

        Producer producer = new Producer(dataQueue);
        Thread producerThread = new Thread(producer);

        Consumer consumer = new Consumer(dataQueue);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}