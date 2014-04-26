package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.DnaLocationEffect;

public final class DnaCommand extends CommandBase {

	public DnaCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		DnaLocationEffect effect = new DnaLocationEffect(em, player.getEyeLocation());
		effect.start();
	}

}
