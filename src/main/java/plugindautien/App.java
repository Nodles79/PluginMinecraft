package plugindautien;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin
{
   @Override
   public void onEnable(){
      getServer().getConsoleSender().sendMessage("Plugin da hoat dong");
   }
   @Override
   public void onDisable(){
      getServer().getConsoleSender().sendMessage("Plugin da tat");
   }
}
