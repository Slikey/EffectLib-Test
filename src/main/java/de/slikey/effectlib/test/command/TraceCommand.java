package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.TraceEntityEffect;

public final class TraceCommand extends CommandBase {
	
	public TraceCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		TraceEntityEffect effect = new TraceEntityEffect(em, player);
		effect.start();
	}

}
