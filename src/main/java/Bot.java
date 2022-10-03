import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    public String getBotUsername() {
        return "kiryl_music_bot";
    }

    public String getBotToken() {
        return "5444343732:AAFYmn3lE2UTNJ8tXSsllRNNYauCCG50jUU";
    }

    public void onUpdateReceived(Update update) {
        String name =update.getMessage().getText();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId().toString());
            sendMessage.setText("Hello " + name);

        try{
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
