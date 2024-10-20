public class Main {
    public static void main(String[] args) {
        // Crear el contexto de cifrado y el administrador de locks
        EncryptionContext encryptionContext = new EncryptionContext();
        LockManager lockManager = new LockManager();
        StorageManager storageManager = new StorageManager(encryptionContext, lockManager);

        // Seleccionar el algoritmo y almacenar datos
        EncryptionAlgorithm algorithmA = new AlgorithmA();
        storageManager.storeData("file1", "mySensitiveData", algorithmA);

        // Recuperar datos
        String decryptedData = storageManager.retrieveData("file1", algorithmA);
        System.out.println("Decrypted data: " + decryptedData);
    }
}
