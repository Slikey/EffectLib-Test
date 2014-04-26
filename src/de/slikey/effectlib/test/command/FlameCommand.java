package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.FlameEntityEffect;

public final class FlameCommand extends CommandBase {
	
	public FlameCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		FlameEntityEffect effect = new FlameEntityEffect(em, player);
		effect.start();
	}

}
