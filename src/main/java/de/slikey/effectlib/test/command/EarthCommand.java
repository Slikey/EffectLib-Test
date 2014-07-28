package de.slikey.effectlib.test.command;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.EarthLocationEffect;
import org.bukkit.entity.Player;

public final class EarthCommand extends CommandBase {

	public EarthCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		EarthLocationEffect effect = new EarthLocationEffect(em, player.getEyeLocation());
		effect.start();
	}

}
