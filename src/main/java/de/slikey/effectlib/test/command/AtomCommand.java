package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.AtomLocationEffect;

public final class AtomCommand extends CommandBase {

	public AtomCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		AtomLocationEffect effect = new AtomLocationEffect(em, player.getEyeLocation());
		effect.iterations = -1;
		effect.start();
	}

}
