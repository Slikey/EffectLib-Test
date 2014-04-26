package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.MusicEntityEffect;

public final class MusicCommand extends CommandBase {
	
	public MusicCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		MusicEntityEffect effect = new MusicEntityEffect(em, player);
		effect.start();
	}

}
