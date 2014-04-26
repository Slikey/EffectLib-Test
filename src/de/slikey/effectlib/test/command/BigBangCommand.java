package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.BigBangLocationEffect;

public final class BigBangCommand extends CommandBase {

	public BigBangCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		BigBangLocationEffect effect = new BigBangLocationEffect(em, player.getLocation());
		effect.start();
	}

}
