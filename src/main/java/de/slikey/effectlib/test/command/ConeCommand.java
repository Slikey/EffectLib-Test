package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.ConeLocationEffect;

public final class ConeCommand extends CommandBase {

	public ConeCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		ConeLocationEffect effect = new ConeLocationEffect(em, player.getEyeLocation());
		effect.randomize = false;
		effect.start();
	}

}
