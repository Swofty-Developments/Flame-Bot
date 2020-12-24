import org.javacord.api.AccountType;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.listener.message.MessageCreateListener;

import java.util.concurrent.ExecutionException;
import java.util.function.Function;

public class Main {
 
    public static void main(String[] args) {
        String token = "NTc0MDkwOTI2OTg1NTc2NDQ4.X7yVYw.CxyGNCM8h8KDLQa35e0JtVYToOU";

        DiscordApi api = new DiscordApiBuilder()
                .setToken(token)
                .setAccountType(AccountType.CLIENT)
                .login()
                .join();

        Thread t1 = new Thread(() -> {
            int count = 1;
            while (true) {
                try {
                    api.getUserById("381688735772835848").get().sendMessage("Merry Christmas");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }

                System.out.println(count);
                count++;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();

    }
}
