package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.StarLocationEffect;

public final class StarCommand extends CommandBase {
	
	public StarCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		StarLocationEffect effect = new StarLocationEffect(em, player.getLocation());
		effect.start();
	}

}
