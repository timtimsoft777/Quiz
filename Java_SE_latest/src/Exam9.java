import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

    public class Exam9 {
        public static void main(String[] args) {

            ExecutorService executor = Executors.newFixedThreadPool(3);

            for (int i = 1; i <= 5; i++) {
                int taskId = i;
                Runnable task = () -> {
                    System.out.println("Vəzifə " + taskId + " başladı - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Vəzifə " + taskId + " bitdi - " + Thread.currentThread().getName());
                };

                executor.submit(task);
            }

            // 4. Executor-u bağlayırıq (artıq yeni iş qəbul etməsin)
            executor.shutdown();
        }
    }