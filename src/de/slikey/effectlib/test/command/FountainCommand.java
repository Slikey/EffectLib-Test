package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.FountainLocationEffect;

public final class FountainCommand extends CommandBase {
	
	public FountainCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		FountainLocationEffect effect = new FountainLocationEffect(em, player.getLocation());
		effect.start();
	}

}
