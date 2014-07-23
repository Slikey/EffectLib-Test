package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.WarpEntityEffect;

public final class WarpCommand extends CommandBase {
	
	public WarpCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		WarpEntityEffect effect = new WarpEntityEffect(em, player);
		effect.start();
	}

}
