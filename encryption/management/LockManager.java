public class LockManager {
    public void acquireLock(String key) {
        //adquirir lock
        System.out.println("Lock acquired for key: " + key);
    }

    public void releaseLock(String key) {
        // liberar lock
        System.out.println("Lock released for key: " + key);
    }
}

