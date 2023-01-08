package fr.raphmar2019.reenashop.commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

import fr.raphmar2019.reenashop.ReenaShop;

// Shop command
public class ShopCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("We are sorry, this command cannot be executed by the server");
			return false;
		}
		
		ReenaShop.sui.openInventory((Player)sender);
		return true;
	}

}
