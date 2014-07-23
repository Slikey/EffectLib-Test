package de.slikey.effectlib.test.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;

public abstract class CommandBase implements CommandExecutor {

	protected final EffectManager em;
	
	public CommandBase(EffectManager em) {
		this.em = em;
	}
	
	@Override
	public final boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if (arg0 instanceof Player)
			effect((Player) arg0);
		return true;
	}
	
	protected abstract void effect(final Player player);
	
}
