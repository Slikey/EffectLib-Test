package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.ExplodeLocationEffect;

public final class ExplodeCommand extends CommandBase {
	
	public ExplodeCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		ExplodeLocationEffect effect = new ExplodeLocationEffect(em, player.getLocation());
		effect.start();
	}

}
