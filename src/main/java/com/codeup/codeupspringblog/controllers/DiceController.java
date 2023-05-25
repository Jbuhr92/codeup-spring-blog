import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String rollDice(Model model) {
        model.addAttribute("numberList", new int[]{1, 2, 3, 4, 5, 6});
        return "rollDice";
    }

    @GetMapping("/roll-dice/{n}")
    public String guessNumber(@PathVariable int n, Model model) {
        Random rand = new Random();
        int diceNumber = rand.nextInt(6) + 1;
        model.addAttribute("diceNumber", diceNumber);
        model.addAttribute("guessedNumber", n);
        model.addAttribute("isCorrect", diceNumber == n);
        return "guessResult";
    }
}
