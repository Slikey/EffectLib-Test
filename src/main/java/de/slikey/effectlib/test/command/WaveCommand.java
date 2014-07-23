package de.slikey.effectlib.test.command;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.WaveLocationEffect;
import org.bukkit.entity.Player;

public final class WaveCommand extends CommandBase {

	public WaveCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		WaveLocationEffect effect = new WaveLocationEffect(em, player.getLocation());
		effect.start();
	}

}
