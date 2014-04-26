package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.MusicLocationEffect;

public final class MusicLocCommand extends CommandBase {
	
	public MusicLocCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		MusicLocationEffect effect = new MusicLocationEffect(em, player.getLocation());
		effect.start();
	}

}
