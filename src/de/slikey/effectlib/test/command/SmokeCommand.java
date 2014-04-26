package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.SmokeEntityEffect;

public final class SmokeCommand extends CommandBase {
	
	public SmokeCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		SmokeEntityEffect effect = new SmokeEntityEffect(em, player);
		effect.start();
	}

}
