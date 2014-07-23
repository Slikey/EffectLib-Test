package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.LineLocationEffect;

public final class LineCommand extends CommandBase {

	public LineCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		LineLocationEffect effect = new LineLocationEffect(em, player.getEyeLocation(), player.getEyeLocation().add(7, 6, -5));
		effect.start();
	}

}
