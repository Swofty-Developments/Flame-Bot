import org.javacord.api.AccountType;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.channel.Channel;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.listener.message.MessageCreateListener;

import java.awt.*;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

public class Main {

    public static Channel logging;
 
    public static void main(String[] args) {
        String token = "hidden";

        DiscordApi api = new DiscordApiBuilder()
                .setToken(token)
                .setAccountType(AccountType.BOT)
                .login()
                .join();
        
        Nzg2MTg2MTQyNDAzNTI2Njc2.X9Cu5g.Gif_INLVtzCHfIBh4j-8JVqDeFY

        logging = api.getChannelById("798085737110437900").get().asServerTextChannel().get();

        logging.asServerTextChannel().get().sendMessage(makeEmbed("Dev Event - Startup", "Bot initialization has taken 0." + System.currentTimeMillis() + "ms", Color.red));

        api.addReactionAddListener(event -> {
            String messageId = Objects.toString(event.getMessageId());

                // Copper
            if (messageId.equalsIgnoreCase("798092120690262017")) {
                event.getUser().get().addRole(api.getRoleById("795549026711502898").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Added", "Gave Copper role to " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Silver
            } else if (messageId.equalsIgnoreCase("798092157076111394")) {
                event.getUser().get().addRole(api.getRoleById("795549106709069834").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Added", "Gave Silver role to " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Gold
            } else if (messageId.equalsIgnoreCase("798092177053581322")) {
                event.getUser().get().addRole(api.getRoleById("795549137701306469").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Added", "Gave Gold role to " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Plat
            } else if (messageId.equalsIgnoreCase("798092195516252181")) {
                event.getUser().get().addRole(api.getRoleById("795549221478334474").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Added", "Gave Platinum role to " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Diamond
            } else if (messageId.equalsIgnoreCase("798092216170053643")) {
                event.getUser().get().addRole(api.getRoleById("795549175273881621").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Added", "Gave Diamond role to " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Champion
            } else if (messageId.equalsIgnoreCase("798092234444505108")) {
                event.getUser().get().addRole(api.getRoleById("795549363673497610").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Added", "Gave Champion role to " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Girl
            } else if (messageId.equalsIgnoreCase("798092280753684491")) {
                event.getUser().get().addRole(api.getRoleById("795980442624458762").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Added", "Gave Girl role to " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Boy
            } else if (messageId.equalsIgnoreCase("798092296360558613")) {
                event.getUser().get().addRole(api.getRoleById("795579374908735558").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Added", "Gave Boy role to " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Non-Binary
            } else if (messageId.equalsIgnoreCase("798092313225854996")) {
                event.getUser().get().addRole(api.getRoleById("795579374908735558").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Error", "Error occured when giving Non-Binary role to " + event.getUser().get().getDiscriminatedName(), Color.green));

                // 12-
            } else if (messageId.equalsIgnoreCase("798092333882015774")) {
                event.getUser().get().addRole(api.getRoleById("796722599936655380").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Added", "Gave 12- role to " + event.getUser().get().getDiscriminatedName(), Color.green));

                // 13-16
            } else if (messageId.equalsIgnoreCase("798092349044555827")) {
                event.getUser().get().addRole(api.getRoleById("796722592802668574").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Added", "Gave 13-16 role to " + event.getUser().get().getDiscriminatedName(), Color.green));

                // 17+
            } else if (messageId.equalsIgnoreCase("798092368410443846")) {
                event.getUser().get().addRole(api.getRoleById("796722597311938580").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Added", "Gave 17+ role to " + event.getUser().get().getDiscriminatedName(), Color.green));
            }
        });

        api.addReactionRemoveListener(event -> {
            String messageId = Objects.toString(event.getMessageId());

            // Copper
            if (messageId.equalsIgnoreCase("798092120690262017")) {
                event.getUser().get().removeRole(api.getRoleById("795549026711502898").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Removed", "Taken Copper role from " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Silver
            } else if (messageId.equalsIgnoreCase("798092157076111394")) {
                event.getUser().get().removeRole(api.getRoleById("795549106709069834").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Removed", "Taken Silver role from " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Gold
            } else if (messageId.equalsIgnoreCase("798092177053581322")) {
                event.getUser().get().removeRole(api.getRoleById("795549137701306469").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Removed", "Taken Gold role from " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Plat
            } else if (messageId.equalsIgnoreCase("798092195516252181")) {
                event.getUser().get().removeRole(api.getRoleById("795549221478334474").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Removed", "Taken Platinum role from " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Diamond
            } else if (messageId.equalsIgnoreCase("798092216170053643")) {
                event.getUser().get().removeRole(api.getRoleById("795549175273881621").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Removed", "Taken Diamond role from " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Champion
            } else if (messageId.equalsIgnoreCase("798092234444505108")) {
                event.getUser().get().removeRole(api.getRoleById("795549363673497610").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Removed", "Taken Champion role from " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Girl
            } else if (messageId.equalsIgnoreCase("798092280753684491")) {
                event.getUser().get().removeRole(api.getRoleById("795980442624458762").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Removed", "Taken Girl role from " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Boy
            } else if (messageId.equalsIgnoreCase("798092296360558613")) {
                event.getUser().get().removeRole(api.getRoleById("795579374908735558").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Removed", "Taken Boy role from " + event.getUser().get().getDiscriminatedName(), Color.green));

                // Non-Binary
            } else if (messageId.equalsIgnoreCase("798092313225854996")) {
                event.getUser().get().removeRole(api.getRoleById("795579374908735558").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Error", "Error occured when giving Non-Binary role from " + event.getUser().get().getDiscriminatedName(), Color.green));

                // 12-
            } else if (messageId.equalsIgnoreCase("798092333882015774")) {
                event.getUser().get().removeRole(api.getRoleById("796722599936655380").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Removed", "Taken 12- role from " + event.getUser().get().getDiscriminatedName(), Color.green));

                // 13-16
            } else if (messageId.equalsIgnoreCase("798092349044555827")) {
                event.getUser().get().removeRole(api.getRoleById("796722592802668574").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Removed", "Taken 13-16 role from " + event.getUser().get().getDiscriminatedName(), Color.green));

                // 17+
            } else if (messageId.equalsIgnoreCase("798092368410443846")) {
                event.getUser().get().removeRole(api.getRoleById("796722597311938580").get());
                logging.asServerTextChannel().get().sendMessage(makeEmbed("Role Removed", "Taken 17+ role from " + event.getUser().get().getDiscriminatedName(), Color.green));
            }
        });

        api.addMessageCreateListener(event -> {
            Channel channel = event.getChannel();

            switch (event.getMessageContent()) {
                case "m!shutdown":
                    if (event.getMessageAuthor().getIdAsString().equalsIgnoreCase("574090926985576448")) {
                        event.getChannel().sendMessage("Shutting down all threads");
                        logging.asServerTextChannel().get().sendMessage(makeEmbed("Dev Event - Shutdown", "Bot shutdown has taken 0." + System.currentTimeMillis() + "ms", Color.black));
                        api.disconnect();
                    } else {
                        event.getChannel().sendMessage(makeEmbed("No Permission", "You do not have permission to perform this action", Color.red));
                    }
                    break;

            }


        });



    }

    public static EmbedBuilder makeEmbed(String title, String message, Color color) {
        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle(title);
        embed.setDescription(message);
        embed.setColor(color);
        return embed;
    }
}
