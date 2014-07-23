package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.BleedEntityEffect;

public final class BleedCommand extends CommandBase {
	
	public BleedCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		BleedEntityEffect effect = new BleedEntityEffect(em, player);
		effect.iterations = 5 * 20;
		effect.start();
	}

}
