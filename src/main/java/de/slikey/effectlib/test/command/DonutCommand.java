package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.DonutLocationEffect;

public final class DonutCommand extends CommandBase {

	public DonutCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		DonutLocationEffect effect = new DonutLocationEffect(em, player.getEyeLocation());
		effect.xRotation = Math.PI / 2;
		effect.start();
	}

}
