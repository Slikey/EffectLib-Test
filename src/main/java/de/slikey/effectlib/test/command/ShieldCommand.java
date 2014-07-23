package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.ShieldEntityEffect;

public final class ShieldCommand extends CommandBase {
	
	public ShieldCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		ShieldEntityEffect effect = new ShieldEntityEffect(em, player);
		effect.start();
	}

}
