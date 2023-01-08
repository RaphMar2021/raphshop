package fr.raphmar2019.reenashop.util;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemGiveHandler {
	public static boolean CheckIfPlayerHaveEnougthItems(final Player p, final Material m, final Integer count) {
		if (p.getInventory().contains(m, count))
		{
			return true;
		}
		
		return false;
	}
}
