package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.HillLocationEffect;

public final class HillCommand extends CommandBase {

	public HillCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		HillLocationEffect effect = new HillLocationEffect(em, player.getLocation());
		effect.start();
	}

}
