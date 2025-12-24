class Producer implements Runnable{
    private final DataQueue dataQueue;
    private boolean running = false;
    public Producer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        running = true;
        produce();
    }

    public void produce() {
        while (running) {
            if(dataQueue.isFull()) {
                try {
                    System.out.println("Data Queue is Full");
                    dataQueue.waitIsNotFull();
                } catch (InterruptedException e) {
                    System.out.println("Error while waiting to Produce messages.");
                    break;
                }
            }
            if (!running) {
                break;
            }
            dataQueue.add(generateMessage());
        }
        System.out.println("Producer Stopped");
    }

    public Message generateMessage(){
        try{
            Thread.currentThread().sleep(1000);
        } catch(InterruptedException e){

        }
        String content = MessageCreator.getMessage();
        Message msg = new Message(content);
        System.out.println("Creating message with ID: " + msg.getId());
        return msg;
    }
}