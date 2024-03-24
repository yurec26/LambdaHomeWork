public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener callback2;
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener callback2) {
        this.callback = callback;
        this.callback2 = callback2;
    }
    public void start() {
        for (int i = 0; i < 27; i++) {
            if (i==19){
                callback2.onError("FUCK");
            }
            callback.onDone("Task " + i + " is done");
        }
    }

}