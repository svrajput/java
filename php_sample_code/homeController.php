<?php

//replace with composer auto load - start
require_once "salesRepository.php";

require_once "./ReportFormater/HtmlOutput.php";


//replace with composer auto load - end

/**
 * Created by PhpStorm.
 * User: sunil
 * Date: 2/14/2017
 * Time: 12:38 PM
 */

class homeContrlller {

    public function getSalesReport() {
        $salesReport = new SalesReport();
        $sales = $salesReport->between('2/1/216', '2/15/216', new HtmlOutput() );
    }

}

  