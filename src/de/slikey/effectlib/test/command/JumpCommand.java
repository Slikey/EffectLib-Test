package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.JumpEntityEffect;

public final class JumpCommand extends CommandBase {
	
	public JumpCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		JumpEntityEffect effect = new JumpEntityEffect(em, player);
		effect.start();
	}

}
