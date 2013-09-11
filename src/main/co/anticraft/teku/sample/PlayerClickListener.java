/**
 * 
 */
package co.anticraft.teku.sample;

/**
 * @author Teku
 *
 */

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.block.Action;

public final class PlayerClickListener implements Listener {

	public static FireShield plugin;
	
	public PlayerClickListener(FireShield instance){
		plugin = instance;
		
	}
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
		
		if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
			
			String blockType = event.getClickedBlock().getType().toString();
			
			Player player = (Player) event.getPlayer();
			
			player.sendMessage("Here's what you hit: " + blockType);			
		}

	}
	
}