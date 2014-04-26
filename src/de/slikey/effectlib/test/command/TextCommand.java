package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.TextLocationEffect;

public final class TextCommand extends CommandBase {

	public TextCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		TextLocationEffect effect = new TextLocationEffect(em, player.getLocation());
		effect.text = (char) 187 + " Like & Follow! " + (char) 171;
		effect.start();
	}

}
