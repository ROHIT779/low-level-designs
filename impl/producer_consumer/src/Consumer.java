class Consumer implements Runnable{
    private final DataQueue dataQueue;
    private boolean running = false;

    public Consumer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        running = true;
        consume();
    }

    public void consume() {
        while (running) {
            if(dataQueue.isEmpty()) {
                try {
                    dataQueue.waitIsNotEmpty();
                } catch (InterruptedException e) {
                    System.out.println("Error while waiting to Consume messages.");
                    break;
                }
            }
            if (!running) {
                break;
            }
            Message message = dataQueue.remove();
            useMessage(message);
        }
        System.out.println("Consumer Stopped");
    }

    public void useMessage(Message message){
        try{
            Thread.currentThread().sleep(1000);
        } catch(InterruptedException e){

        }
        System.out.println("Consumer reading message with ID: " + message.getId() + " - " + message.getContent());
    }
}