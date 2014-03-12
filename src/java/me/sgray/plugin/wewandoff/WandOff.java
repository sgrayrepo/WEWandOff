package me.sgray.plugin.wewandoff;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.sk89q.worldedit.LocalSession;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;

public class WandOff extends JavaPlugin implements Listener {
  WorldEditPlugin wepl;
  
  public void onDisable() {}

  public void onEnable() {
    wepl = (WorldEditPlugin) getServer().getPluginManager().getPlugin("WorldEdit");
    if(wepl == null) {
      getLogger().info("WorldEdit is not enabled! WEWandOff has no functions without it!");
    }
    getServer().getPluginManager().registerEvents(this,this);
  }

  @EventHandler
  public void onPlayerLoginSuccess(PlayerJoinEvent event) {
    if(wepl != null) {
      Player player = event.getPlayer();
      if(player.hasPermission("worldedit.selection.pos") && !player.hasPermission("wandoff.override")) {
        LocalSession session = wepl.getSession(player);
        session.setToolControl(false);
        if(player.hasPermission("wandoff.showalert")) player.sendMessage(ChatColor.GOLD + "The WorldEdit wand is disabled. Enable with /toggleeditwand");
      }
    }
  }
}
