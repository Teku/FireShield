/**
 * 
 */
package co.anticraft.teku.sample;

/**
 * @author Teku
 *
 */
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
//import java.util.HashMap;
import org.bukkit.entity.Player;
//import org.bukkit.plugin.PluginDescriptionFile;
//import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class FireShield extends JavaPlugin {

	@Override
	public void onEnable(){
		// Code here...
		getLogger().info("FireShield loaded.");
	}
	
	@Override
	public void onDisable(){
		// Code here...
		getLogger().info("FireShield unloaded.");
	}
	
	// Command - /ignite
	public boolean onCommand(CommandSender sender, Command cmd, String lavel, String[] args){
		if(cmd.getName().equalsIgnoreCase("ignite")){ // If /ignite then...
			if(!(sender instanceof Player)){
				sender.sendMessage("This command can only be run by a player.");
			}else{
				Player player = (Player) sender;
				// Start player on Fire
				player.setFireTicks(1000);
				// Message
				player.sendMessage("I don't know what you expected");
			}
			return true;
		}
		return false;
	}
}