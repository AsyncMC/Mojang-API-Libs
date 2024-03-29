<?php

namespace com.github.asyncmc.mojang.api.php.ze.ph.server\Strategy;

class QueryParameterArray extends QueryParameter
{
    const FORMAT_CSV = 'csv'; //comma separated values foo,bar.
    const FORMAT_SSV = 'ssv'; //space separated values foo bar.
    const FORMAT_TSV = 'tsv'; //tab separated values foo\tbar.
    const FORMAT_PIPES = 'pipes'; //pipe separated values foo|bar.
    const FORMAT_MULTI = 'multi'; //corresponds to multiple parameter instances instead of multiple values for a single instance foo[]=bar&foo[]=baz.

    const DELIMITER_MAP = [
        self::FORMAT_CSV => ',',
        self::FORMAT_SSV => ' ',
        self::FORMAT_TSV => "\t",
        self::FORMAT_PIPES => '|',
        self::FORMAT_MULTI => null,
    ];

    /**
     * @var string|null
     */
    protected $delimiter;

    public function __construct(array $options)
    {
        parent::__construct($options);
        if (empty($options['format'])) {
            throw new \InvalidArgumentException('Option "format" is required.');
        } elseif (!array_key_exists($options['format'], self::DELIMITER_MAP)) {
            throw new \InvalidArgumentException(sprintf('Unknown format "%s".', $options['format']));
        }
        $this->delimiter = self::DELIMITER_MAP[$options['format']];
    }

    /**
     * @inheritdoc
     */
    public function extract($objectValue, $object = null)
    {
        $result = null;
        if (is_array($objectValue)) {
            if ($this->delimiter === null) {
                $result = $objectValue;
            } else {
                $result = implode($this->delimiter, $objectValue);
            }
        }
        return $result;
    }

    /**
     * @inheritdoc
     */
    public function hydrate($arrayValue, $objectValue, array $array = null)
    {
        $result = null;
        if ($arrayValue !== null) {
            $list = null;
            if ($this->delimiter === null) {
                $list = (is_array($arrayValue))? $arrayValue : [$arrayValue];
            } else {
                $list = explode($this->delimiter, $arrayValue);
            }
            $result = [];
            foreach ($list as $item) {
                $result[] = parent::hydrate($item, null);
            }
        }
        return $result;
    }
}
