package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.GridLocationEffect;
import de.slikey.effectlib.util.MathUtils;

public final class GridCommand extends CommandBase {
	
	public GridCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		GridLocationEffect effect = new GridLocationEffect(em, player.getLocation());
		effect.rotation = -player.getLocation().getYaw() * MathUtils.degreesToRadians;
		effect.start();
	}

}
