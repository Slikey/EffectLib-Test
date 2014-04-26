package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.ArcLocationEffect;

public final class ArcCommand extends CommandBase {

	public ArcCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		ArcLocationEffect effect = new ArcLocationEffect(em, player.getEyeLocation(), player.getEyeLocation().add(10, 2, 6));
		effect.start();
	}

}
