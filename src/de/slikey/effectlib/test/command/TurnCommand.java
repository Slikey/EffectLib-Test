package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.TurnPlayerEffect;

public final class TurnCommand extends CommandBase {
	
	public TurnCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		TurnPlayerEffect effect = new TurnPlayerEffect(em, player);
		effect.start();
	}

}
