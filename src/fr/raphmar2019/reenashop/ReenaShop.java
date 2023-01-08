package fr.raphmar2019.reenashop;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.*;

import fr.raphmar2019.reenashop.commands.*;
import fr.raphmar2019.reenashop.userinterface.ShopUserInterface;


public class ReenaShop extends JavaPlugin {
	public static ShopUserInterface sui;
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	sui = new ShopUserInterface();
    	Bukkit.getPluginManager().registerEvents(sui, this);
    	this.getCommand("shop").setExecutor(new ShopCommand());
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }

}
