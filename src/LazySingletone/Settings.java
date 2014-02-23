package LazySingletone;

public class Settings {

    public static final String GAME_NAME = "tictactoe";

    public static Settings getInstance() {
        return SettingsInstanceHolder.INSTANCE;
    }

    private Settings() {
        System.out.println("inside settings");
    }

    public static String getGameName() {
        return GAME_NAME;
    }

    public static class SettingsInstanceHolder {

        public static Settings INSTANCE = new Settings();
        private  SettingsInstanceHolder() {};

    }
}
