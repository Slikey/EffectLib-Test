package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.HelixLocationEffect;

public final class HelixCommand extends CommandBase {
	
	public HelixCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		HelixLocationEffect effect = new HelixLocationEffect(em, player.getLocation());
		effect.start();
	}

}
