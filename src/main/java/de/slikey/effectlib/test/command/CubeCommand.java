package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.CubeLocationEffect;

public final class CubeCommand extends CommandBase {

	public CubeCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		CubeLocationEffect effect = new CubeLocationEffect(em, player.getEyeLocation());
		effect.start();
	}

}
