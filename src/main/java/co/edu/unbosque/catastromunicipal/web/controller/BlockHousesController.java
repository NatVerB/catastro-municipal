package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;
import co.edu.unbosque.catastromunicipal.domain.service.BlockHousesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blockhouses")
public class BlockHousesController {
    @Autowired
    private BlockHousesService blockHousesService;

    @GetMapping("/allblockhouses")
    }

    @GetMapping("/blockhousestreet/{street}")
    }

    @GetMapping("/blockhousenumber/{number}")
    }

    @DeleteMapping("/deleteblockhouse/bynumber")
    }

    @DeleteMapping("deleteblockhouse/bystreet")
    }

    @PostMapping("/addblockhouse")
    }

    }
}